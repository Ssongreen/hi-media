const title = document.getElementById('title');
const append = document.querySelector('#append');
const paragraph = document.querySelector('.paragraph');
const a_paragraph = document.getElementsByClassName('paragraph');

console.log(title);
console.log(typeof title);
title.innerText = '헿';

append.innerText = '<h3>추가된 제목</h3>';
console.log(append);
append.innerHTML = '<h3>추가된 제목</h3>';
console.log(append);


console.log(paragraph);

paragraph.innerText = 'Frist paragraph';
paragraph.style.color = 'lightgreen';
console.log(typeof a_paragraph);

const arr_paragraph = Array.from(a_paragraph);
console.log(arr_paragraph);
console.log(typeof arr_paragraph);

arr_paragraph.forEach(element => element.style.textAlign ='center');

