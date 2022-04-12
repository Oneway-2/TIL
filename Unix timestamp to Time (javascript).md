# Unix Timestamp to Time

- Unix Timestamp 란?
  - 1970년 1월 1일 00:00:00 협정 세계시(UTC)로부터 경과 시간을 초로 환산하여 정수로 나타낸 것.

```javascript
const now = new Date(); // 현재 시간을 Date 형식으로 저장

// Date 형식을 Timestamp 로 변환하기
var nowTimestamp = new Date().getTime(); // 1649774735470
nowTimestamp = nowTimestamp / 1000; // 1649774807.79
nowTimestamp = Math.floor(nowTimestamp); // 1649774837 변환 완료.

// Timestamp 형식을 Date와 비슷한 형식으로 변환하기

function Unix_timestamp(t) {
  var date = new Date(t * 1000);
  var year = date.getFullYear();
  var month = "0" + (date.getMonth() + 1);
  var day = "0" + date.getDate();
  var hour = "0" + date.getHours();
  var minute = "0" + date.getMinutes();
  var second = "0" + date.getSeconds();
  return (
    year +
    "-" +
    month.substr(-2) +
    "-" +
    day.substr(-2) +
    " " +
    hour.substr(-2) +
    ":" +
    minute.substr(-2) +
    ":" +
    second.substr(-2)
  );
}

console.log(now); // 2022-04-12T14:49:59.476Z
console.log(nowTimestamp); // 1649774999
console.log(Unix_timestamp(nowTimestamp)); // 2022-04-12 23:49:59
```

출처 : https://reword12.tistory.com/8
