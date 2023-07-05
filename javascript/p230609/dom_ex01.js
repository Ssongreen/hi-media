/**
 * 1.단일 element 추출 반환
 * 1-1 document.getElementById('아이디');
 * 1-2 document.querySelector('선택자');
 *  아이디 : '#아이디'
 *  클래스 : '.클래스'
 *  태그   : '태그'
 * 
 * 2. 복수 element 추출
 * 2-1 document.getElementsByClassName('클래스');
 * 2-2 document.getElementsByTagName('태그');
 * 2-3 document.querySelectorAll('선택자');
 *  document.querySelectorAll('선택자1','선택자2');
 * 
 * **/

const id_txt=document.getElementById('txt');
const id_greeting = document.querySelector('#greeting');

console.log(id_txt);
console.log(id_greeting);
console.log(typeof id_greeting);
console.log('inner', id_greeting.innerText);
id_greeting.innerText='헿';

const cla_c_txt = document.getElementsByClassName('c_txt');
const div = document.getElementsByTagName('div');


console.log(cla_c_txt);
console.log(cla_c_txt[1]);
console.log(div)

window.addEventListener("scroll", function(){
    let value = this.window.screenX;
    console.log("scorllX",value);
});

