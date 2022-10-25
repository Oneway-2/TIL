# URI, URL, URN

## URI (Uniform Resource Identifier)

-   통합 자원 식별자
-   인터넷 자원을 식별할 수 있는 문자열이다.
-   URI의 하위 개념으로 URL와 URN이 있는 것.
-   구성 : <span style="color: #229954">:scheme:</span> <span style="color: #D35400">:hosts:</span> <span style="color: #3498DB">:url-path:</span> <span style="color: #9B59B6">:query:</span>
-   예시1 : <span style="color: #229954">file://</span><span style="color: #D35400">127.0.0.1</span><span style="color: #3498DB">/Users/username/Desktop</span><span style="color: #9B59B6"></span>
-   예시2 : <span style="color: #229954">https://</span><span style="color: #D35400">www.google.com:80</span><span style="color: #3498DB">/search</span><span style="color: #9B59B6">?q=JavaScript</span>
    -   <span style="color: #229954">scheme</span>
        -   가장 먼저 작성한다.
        -   통신 방식(프로토콜)을 결정한다
        -   일반적으로 웹 브라우저에서는 http(s)를 사용한다.
        -   예시: file:// , http:// , https://
    -   <span style="color: #D35400">hosts</span>
        -   웹 서버의 이름, 도메인, IP를 사용하여 주소를 나타낸다.
        -   port 번호를 hosts: 뒤에 입력할 수 있음.
        -   예시: 127.0.0.1 , www.google.com
    -   <span style="color: #229954">url-path</span>
        -   웹 서버에서 지정한 루트 디렉토리부터 시작하여
        -   웹 페이지, 이미지, 동영상 등이 위치한 경로와 파일명을 나타낸다.
        -   예시 : /search , /Users/username/Desktop
    -   <span style="color: #9B59B6">query</span>
        -   웹 서버에 보내는 추가적인 질문이다.
        -   예시 : q=JavaScript

참고로, 예시 2번의 URI를 브라우저의 주소창에 입력하면 구글에서 JavaScript를 검색한 결과가 나타난다.

<br>

## URL (Uniform Resource Locator)

-   네트워크 상에서 웹페이지, 이미지, 동영상 등의 리소스 파일이 위치한 정보를 나타낸다.
-   URL은 FTP, SMTP처럼 다른 프로토콜에서도 사용할 수 있다. 아래는 예시.
    -   ftp://example.com/download.zip (FTP)
    -   user@example.com (SMTP)
-   리소스를 표현하는 방법 중, REST API도 URL이다.

<br>

## URN (Uniform Resource Name)

-   URI의 표준 포맷 중 하나이다.
-   이름으로 리소스를 특정짓는 URI이다.
-   URN은 리소스를 영구적이고 유일하게 식별할 수 있는 URI이다.
-   실제 리소스를 찾기 위해서는 URN을 URL로 변환하여 이용한다.
-   예시

```
urn:oasis:names:specification:docbook:dtd:xml:4.1.2
tel:+1-816-123-1234
```

<br>

참고 이미지

![referimage](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdtX6Er%2FbtqSPFIOWsr%2FV0t3Kfx3sIdq4Tpgm30C20%2Fimg.jpg)

정보 출처 : https://hanamon.kr/%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-%EA%B8%B0%EB%B3%B8-url-uri-urn-%EC%B0%A8%EC%9D%B4%EC%A0%90/
