<h1 align="center">🌟 SpringBoot-Global-Exception-Management 🌟</h1>
<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-2.7.0-green?style=for-the-badge&logo=springboot" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java"/>
  <img src="https://img.shields.io/badge/JPA-Hibernate-orange?style=for-the-badge&logo=hibernate"/>
  <img src="https://img.shields.io/badge/REST%20API-JSON-lightgrey?style=for-the-badge&logo=rest"/>
</p>
<p align="center">
  <b>Kurumsal projelerde kullanıma uygun, merkezi hata yönetimi ve özelleştirilebilir API hata cevapları sunan, Spring Boot tabanlı bir örnek!</b>
</p>

---

## 🚀 Proje Hakkında

Bu proje, Spring Boot ile geliştirilen bir REST API örneğidir. Projede;
- **Global Exception Handling** (Merkezi Hata Yakalama),
- Özelleştirilmiş hata mesajları ve hata tipleri,
- JPA & Hibernate ile veri tabanı işlemleri,
- Katmanlı mimari (Service, Repository, Controller, DTO) örneklenmiştir.

Karmaşık kurumsal uygulamalarda dahi esnek ve sürdürülebilir hata yönetimi için hızlıca adapte edilebilecek bir temel sağlar.

---

## 🏗️ Proje Mimarisi

```
com.faik
│
├── Controller
│   └── RestEmployeeController
│
├── Controller.Impl
│   └── RestEmployeeControllerImpl
│
├── Dto
│   ├── DtoEmployee
│   └── DtoDepartment
│
├── Model
│   ├── Employee
│   └── Department
│
├── Repository
│   └── EmployeeRepository
│
├── Service
│   └── IEmployeeService
│
├── Service.Impl
│   └── EmployeeServiceImpl
│
├── exception
│   ├── BaseException
│   ├── ErrorMessage
│   └── MessageType
│
├── handler
│   ├── GlobalExceptionHandler
│   ├── ApiError
│   └── Exception
│
└── Starter
    └── ExceptionManagmentApplicationStarter
```

---

## 🧩 Özellikler

- 🌐 **RESTful API**: Çalışan ve departman sorgulama.
- 🛡️ **Global Exception Handler**: Tüm uygulama genelinde merkezi hata yakalama.
- 📋 **Özelleştirilebilir Hata Mesajları**: Kod, detay, yol, timestamp, host bilgisi içerir.
- 🗂️ **DTO Kullanımı**: Entity - DTO dönüşümleriyle temiz veri sunumu.
- 🏷️ **Enum ile Mesaj Tipi**: Hata kodları ve tiplerinin merkezi yönetimi.
- 🛠️ **Spring Data JPA**: CRUD işlemlerinin kolay yönetimi.

---

## 📦 Kurulum & Çalıştırma

1. **Projeyi Klonlayın**
   ```bash
   git clone https://github.com/faikaktss/SpringBoot-Global-Exception-Management.git
   cd SpringBoot-Global-Exception-Management
   ```

2. **Veritabanı Ayarları**
   - `application.properties` dosyasını oluşturun ve uygun DB konfigürasyonlarını ekleyin.
   - Örnek:
     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
     spring.datasource.username=youruser
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Projeyi Başlatın**
   ```bash
   ./mvnw spring-boot:run
   ```
   veya
   ```bash
   mvn spring-boot:run
   ```

---

## 🔥 Kullanım

### Çalışan Bilgisi Sorgulama

```
GET /rest/api/employee/list/{id}
```
**Başarılı Yanıt:**
```json
{
  "id": 1,
  "name": "John Doe",
  "dtoDepartment": {
    "id": 1,
    "name": "IT",
    "location": "Istanbul"
  }
}
```

**Kayıt Bulunamazsa Hata Yanıtı:**
```json
{
  "status": 400,
  "exception": {
    "hostName": "your-host",
    "path": "uri=/rest/api/employee/list/999",
    "createTime": "2025-09-27T14:00:00.000+00:00",
    "message": "Kayıt bulunamadı : 999"
  }
}
```

---

## 🏅 Proje Güçlü Yanları

- **Kurumsal projelerde doğrudan kullanılabilir!**
- Exception yönetimi esnek ve genişletilebilir.
- Hata sınıfları ve mesaj yapısı kolayca genişletilebilir.
- Katmanlı mimari ile temiz kod örneği sunar.

---

## 🤝 Katkı Sağlamak

1. Fork'layın 🍴
2. Yeni bir branch oluşturun: `feature/ozellik-adiniz`
3. Değişikliklerinizi commit'leyin: `git commit -m 'Yeni özellik ekledim'`
4. Push: `git push origin feature/ozellik-adiniz`
5. Pull Request açın!

---

## 📚 Kaynaklar

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Exception Handling in Spring Boot](https://www.baeldung.com/exception-handling-for-rest-with-spring)

---

## 🧑‍💻 Yazar

**Faik Aktaş**  
[GitHub Profili](https://github.com/faikaktss)

---

<p align="center">
  <b>⭐️ Projeyi faydalı bulduysanız yıldızlamayı unutmayın! ⭐️</b>
</p>
