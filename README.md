# Richbank WebService Server 架構總結

## 📌 Service Endpoint

- **URL**: `http://localhost:8060/richbankService`
- **通訊協定**: SOAP 1.1
- **Content-Type**: `text/xml; charset=utf-8`
- **HTTP Method**: `POST`

---

## 🧪 Postman 測試設定

### ✅ 步驟

1. **開啟 Postman**
2. Method 設定為 `POST`
3. URL 輸入 `http://localhost:8060/richbankService`
4. Headers 設定：
   - `Content-Type: text/xml`
5. Body → 選擇 `raw`，貼上以下 XML 請求（RQ）

---

## 📤 Request 範例（RQ）

```xml
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
               xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xmlns:xsd="http://www.w3.org/2001/XMLSchema">
    <soap:Body>
        <QuerySerGroup xmlns="http://richbank.com.example.richbank/">
            <TxSeq>101</TxSeq>
            <WSID>99990000</WSID>
            <Branch>0998</Branch>
        </QuerySerGroup>
    </soap:Body>
</soap:Envelope>



<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:QuerySerGroupResponse xmlns:ns2="http://richbank.com.example.richbank/">
            <ns2:QuerySerGroupResult>
                <ns2:MegaSilver>
                    <ns2:Response>
                        <ns2:Code>0000</ns2:Code>
                        <ns2:Desc>Success</ns2:Desc>
                        <ns2:TxSeq>00005904</ns2:TxSeq>
                        <ns2:DateTime>2025/05/02 05:04:47.524</ns2:DateTime>
                    </ns2:Response>
                    <ns2:Group>
                        <ns2:Data>
                            <ns2:GroupID>101</ns2:GroupID>
                            <ns2:Name>開戶/各項申請</ns2:Name>
                        </ns2:Data>
                        <ns2:Data>
                            <ns2:GroupID>101</ns2:GroupID>
                            <ns2:Name>開戶/各項申請1</ns2:Name>
                        </ns2:Data>
                        <ns2:Data>
                            <ns2:GroupID>101</ns2:GroupID>
                            <ns2:Name>開戶/各項申請2</ns2:Name>
                        </ns2:Data>
                    </ns2:Group>
                </ns2:MegaSilver>
            </ns2:QuerySerGroupResult>
        </ns2:QuerySerGroupResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>



RichbankServer/
├── src/
│   ├── main/
│   │   ├── java/com/example/richbank/
│   │   │   ├── request/
│   │   │   │   ├── querySerGroup/  <-- Request/Response classes for QuerySerGroup
│   │   │   │   ├── orderTimeSch/   <-- Request/Response classes for OrderTimeSch
│   │   │   ├── response/
│   │   │   │   ├── ...
│   │   ├── resources/
│   │   │   ├── xsd/
│   │   │   │   ├── request/
│   │   │   │   │   ├── QuerySerGroupRequest.xsd
│   │   │   │   │   ├── OrderTimeSchRequest.xsd
│   │   │   │   ├── response/
│   │   │   │   │   ├── QuerySerGroupResponse.xsd
│   │   │   │   │   ├── OrderTimeSchResponse.xsd
├── build.gradle
└── ...

🛠️ 技術說明
框架：Spring Boot + Spring Web Services

Java 版本：17

JAXB 用於 XSD 轉 Java 類別

使用 Gradle 自動化產生 JAXB 類別至不同 package

📝 備註
所有 XSD 對應的 Java 類別會依照檔名放進不同子 package（orderTimeSch、querySerGroup）

若遇到 ns2 前綴，可透過自訂 JAXB NamespacePrefixMapper 控制

# 🚀 RichbankServer 啟動步驟

本專案為一個基於 Spring Boot 的 SOAP WebService 專案，提供 Richbank 專屬服務。

---

## ✅ 環境需求

| 項目        | 版本              |
|-------------|-------------------|
| JDK         | 17                |
| Gradle      | 8.x（建議使用 wrapper） |
| IDE         | IntelliJ / VSCode（選用） |
| Port        | 預設為 `8060`     |

---

## 📦 專案初始化與啟動流程

### 1. ✅ 下載專案

```bash
git clone [<your-repo-url>](https://github.com/KurtKuo/WebServiceDemo)
cd RichbankServer

使用自動化 Gradle 任務產生：
./gradlew generateAllXsd


啟動server
./gradlew bootRun




