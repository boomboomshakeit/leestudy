 //객체로 만드는것
 let userid = document.querySelector(".userid");
 let passwd = document.querySelector(".passwd");
 let button = document.querySelector("button");

 //페이지 로딩 후 실행되는 자바스크립트
 window.onload = () => {
     userid.focus();
 }


 //내부함수 
 // button.onclick() = function () {
 //   alert("ok");  
 // }

 //화살표함수
 // button.onclick = () => {
 //   alert("ok");  
 // }

 // button.addEventListener(이벤트, 함수);
 button.addEventListener('click', function(e) {
     //alert("ok");
     //이벤트 발생시 동작처리
     e.preventDefault();

     if(userid.value == "") {
         alert("아이디를 입력하세요.");
         userid.focus();
         return false();
     }
 });

 //화살표함수
 //input 버튼 누르면 다음페이지로 이동 특징
 // button.addEventListener('click', (e) => {
 //     e.preventDefault(); //을 막는다.
 //     alert("ok");
 // });