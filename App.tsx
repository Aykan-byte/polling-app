import React, { useState } from "react";
import { View, Text, TextInput, TouchableOpacity, StyleSheet, ImageBackground } from "react-native";

const LoginScreen = ({ navigation }: any) => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [errorMessage, setErrorMessage] = useState("");
  const [isStudentLogin, setIsStudentLogin] = useState(false); // Öğrenci / Akademisyen seçimi
  const [secureText, setSecureText] = useState(true); // Şifreyi gizleme / gösterme

  const handleLogin = () => {
    if (username === "" || password === "") {
      setErrorMessage("Kullanıcı adı ve şifre gereklidir.");
    } else {
      // Başarılı girişte yapılacak yönlendirme (API kısmı daha sonra eklenebilir)
      if (isStudentLogin) {
        // Öğrenci sayfasına yönlendir
        navigation.navigate("StudentPage");
      } else {
        // Akademisyen sayfasına yönlendir
        navigation.navigate("AcademicianPage");
      }
    }
  };

  const togglePasswordVisibility = () => {
    setSecureText(!secureText);
  };

  return (
    <ImageBackground
      source={{ uri: "https://i.pinimg.com/736x/b2/84/8b/b2848bc7a55c1fa8f2da233effe9ae42.jpg" }} // Arka plan görseli
      style={styles.background}
      imageStyle={{ resizeMode: "cover" }}
    >
      <View style={styles.container}>
        <Text style={styles.header}>ERÜ MOBİL YOKLAMA</Text>
        <Text style={styles.subHeader}>Hoşgeldiniz! Lütfen giriş yapınız...</Text>

        {/* Öğrenci ve Akademisyen Girişi Butonları */}
        <View style={styles.loginOptions}>
          <TouchableOpacity
            style={styles.button}
            onPress={() => setIsStudentLogin(true)} // Öğrenci girişi seçildiğinde
          >
            <Text style={styles.buttonText}>Öğrenci Girişi</Text>
          </TouchableOpacity>
          
          <TouchableOpacity
            style={styles.button}
            onPress={() => setIsStudentLogin(false)} // Akademisyen girişi seçildiğinde
          >
            <Text style={styles.buttonText}>Akademisyen Girişi</Text>
          </TouchableOpacity>
        </View>

        {/* Kullanıcı adı / Şifre alanları sadece giriş türüne göre görünsün */}
        {isStudentLogin ? (
          <>
            <TextInput
              style={styles.input}
              placeholder="Öğrenci No"
              value={username}
              onChangeText={setUsername}
              keyboardType="numeric"
            />
          </>
        ) : (
          <>
            <TextInput
              style={styles.input}
              placeholder="Kullanıcı Adı"
              value={username}
              onChangeText={setUsername}
            />
          </>
        )}

        <View style={styles.passwordContainer}>
          <TextInput
            style={styles.input}
            placeholder="Şifre"
            secureTextEntry={secureText}
            value={password}
            onChangeText={setPassword}
          />
          <TouchableOpacity onPress={togglePasswordVisibility} style={styles.showPasswordButton}>
            <Text style={styles.showPasswordText}>{secureText ? "Göster" : "Gizle"}</Text>
          </TouchableOpacity>
        </View>

        {errorMessage ? <Text style={styles.error}>{errorMessage}</Text> : null}

        <TouchableOpacity style={styles.button} onPress={handleLogin}>
          <Text style={styles.buttonText}>Giriş Yap</Text>
        </TouchableOpacity>
      </View>
    </ImageBackground>
  );
};

const styles = StyleSheet.create({
  background: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
  container: {
    width: "90%",
    maxWidth: 400,
    padding: 20,
    backgroundColor: "rgba(0, 0, 0, 0.5)", // Yarı saydam siyah arka plan
    borderRadius: 10,
    alignItems: "center",
  },
  header: {
    fontSize: 24,
    fontWeight: "bold",
    color: "#fff",
    marginBottom: 20,
  },
  subHeader: {
    fontSize: 16,
    color: "#fff",
    marginBottom: 30,
  },
  loginOptions: {
    flexDirection: "row",
    justifyContent: "space-around",
    width: "100%",
    marginBottom: 20,
  },
  input: {
    width: "100%",
    height: 40,
    borderColor: "#ccc",
    borderWidth: 1,
    marginBottom: 10,
    paddingHorizontal: 10,
    borderRadius: 5,
    backgroundColor: "#fff",
  },
  button: {
    backgroundColor: "#003366", // Koyu mavi
    paddingVertical: 10,
    paddingHorizontal: 20,
    borderRadius: 5,
    marginBottom: 10,
  },
  buttonText: {
    color: "#fff",
    fontWeight: "bold",
  },
  passwordContainer: {
    flexDirection: "row",
    alignItems: "center",
    width: "100%",
  },
  showPasswordButton: {
    position: "absolute",
    right: 10,
    padding: 5,
  },
  showPasswordText: {
    color: "#2196F3",
  },
  error: {
    color: "#d9534f",
    fontWeight: "bold",
    textAlign: "center",
    marginBottom: 10,
  },
});

export default LoginScreen;