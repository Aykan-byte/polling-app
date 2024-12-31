import React, { useState } from "react";
import {
  View,
  Text,
  StyleSheet,
  TouchableOpacity,
  ImageBackground,
} from "react-native";

const AcademicianPage = ({ navigation }: any) => {
  const [selectedCourse, setSelectedCourse] = useState("");
  const [showQRCodeButton, setShowQRCodeButton] = useState(false); // QR kod butonunun görünürlüğü

  // Ders seçme fonksiyonu
  const handleCourseSelect = (course: string) => {
    setSelectedCourse(course);
    setShowQRCodeButton(true); // Ders seçildikten sonra QR butonunu göster
  };

  return (
    <ImageBackground
      source={{
        uri: "https://i.pinimg.com/736x/b2/84/8b/b2848bc7a55c1fa8f2da233effe9ae42.jpg",
      }}
      style={styles.background}
    >
      <View style={styles.container}>
        <Text style={styles.header}>Akademisyen Kontrol</Text>

        {/* Ders Seçme */}
        <Text style={styles.subHeader}>Ders Seçiniz:</Text>
        <TouchableOpacity
          style={styles.button}
          onPress={() => handleCourseSelect("Dijital Sistemler")}
        >
          <Text style={styles.buttonText}>Dijital Sistemler</Text>
        </TouchableOpacity>
         <TouchableOpacity
                  style={styles.button}
                  onPress={() => handleCourseSelect("Lojik Devreler")}
                >
                  <Text style={styles.buttonText}>Lojik Devreler</Text>
                </TouchableOpacity>
                <TouchableOpacity
                  style={styles.button}
                  onPress={() => handleCourseSelect("Bilgisayar Grafik")}
                >
                  <Text style={styles.buttonText}>Bilgisayar Grafik</Text>
                </TouchableOpacity>
        <TouchableOpacity
          style={styles.button}
          onPress={() => handleCourseSelect("Mikroişlemciler")}
        >
          <Text style={styles.buttonText}>Mikroişlemciler</Text>
        </TouchableOpacity>

        {/* Seçilen Dersi Göster */}
        {selectedCourse ? (
          <Text style={styles.selectedCourse}>Seçilen Ders: {selectedCourse}</Text>
        ) : null}

        {/* QR Kod Oluştur Butonu */}
        {showQRCodeButton && (
          <TouchableOpacity style={styles.button} onPress={() => {}}>
            <Text style={styles.buttonText}>QR Kod Oluştur</Text>
          </TouchableOpacity>
        )}
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
    backgroundColor: "rgba(0, 0, 0, 0.5)",
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
    fontSize: 18,
    fontWeight: "bold",
    color: "#fff",
    marginBottom: 10,
  },
  button: {
    backgroundColor: "#003366",
    paddingVertical: 10,
    paddingHorizontal: 20,
    borderRadius: 5,
    marginBottom: 10,
  },
  buttonText: {
    color: "#fff",
    fontWeight: "bold",
  },
  selectedCourse: {
    fontSize: 16,
    color: "#fff",
    marginBottom: 20,
  },
});

export default AcademicianPage;