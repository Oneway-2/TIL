# CORS (Cross-Origin Resource Sharing)

- CORS란, 서로 다른 도메인단의 자원을 공유하는 것을 의미한다.
- 서버랑 클라이언트 사이를 분리해서 작업한다면 더욱이 신경써야 한다. (SCR 방식과 같은 경우)

- CORS를 해결하는 방법
  - Access-Control-Allow-Origin: 특정 브라우저가 리소스에 접근이 가능하도록 허용한다.
  - Access-Control-Allow-Method: 특정 HTTP Method만 리소스에 접근이 가능하도록 허용한다.
  - Access-Control-Expose-Headers: 자바스크립트에서 헤더에 접근할 수 있도록 허용한다.
