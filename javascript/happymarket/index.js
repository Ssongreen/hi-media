const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');
const btn = document.querySelector('.btn-modal');
const btn_close = document.querySelector('.btn-close');
const form = document.querySelector('form');
const input = document.querySelector('input');
const ul = document.querySelector('ul');

// const sign_up = document.querySelector('.sign-up');
/**
 *  1번
 *  text box에 입력후, 등록 버튼을 클릭하면 li 추가
 *  등록 버튼이나 from을 해도 가능
 * **/
// sign_up.addEventListener('click', (e) => {});
/**
 form.addEventListener('submit', (event) => {
   
   // refresh 방지
   event.preventDefault();
 
 
   // li 생성
   const li = document.createElement('li');
   
   // li에 텍스트 셋
   li.innerText = input.value;
 
   // ul 자식으로 li 추가
   ul.appendChild(li);
 
   // 입력값 초기화
   input.value = '';
   console.log('등록버튼 클릭');
   
 });
 * 
 * 
 * **/

/**
 * 구현2 refactoring 
 * 2-1 코드 분리 listener, handler
 * 
 * **/


// //function
// const addLi = () => {
//   const li = document.createElement('li');

//   li.innerText = input.value;
//   ul.appendChild(li);

// };

// //handler
// const handler = (event) => {

//   //refresh 방지
//   event.preventDefault();

//   // 빈문자열이 아닌 경우에만 추가
//   //ul에 li 추가
//   // if (input.value === '') return;
//   if (input.value !== '') addLi();

//   // li 초기화
//   input.value = '';

// };

// //listener
// form.addEventListener('submit', handler);


/**
 * 기능 구현
 * li 엘리먼트가 추가되면, 삭제 버튼도 같이 추가
 * li content를 website에 저장
 * 삭제 버튼을 클릭하면, website에 저장된 데이터 삭제
 * 새로 고침하면, website에 저장된 데이터 표현
 * **/

//function
const addLi = (li_item) => {
  const li = document.createElement('li');
  ul.appendChild(li);

  // span 추가
  const span_content = document.createElement('span');
  span_content.innerText = li_item.content;
  // li.appendChild(span_content);

  const btn_cross = document.createElement('button');
  // li.appendChild(btn_cross);


  li.append(span_content, btn_cross);

  btn_cross.addEventListener('click', deleteLi);

  // localStorage에 저장된 요소 삭제 할때
  // 기준으로 사용될 id
  li.id = li_item.id;

};

// 삭제
const deleteLi = (event) => {
  // console.log('deleting');
  // console.log(event.target.parentElement);
  const target = event.target.parentElement;

  // console.log(event.target.parentElement.id);

  li_items = li_items.filter((li_item) => {
    return li_item.id != target.id;

  });
  console.log(li_items);

  //li 삭제
  target.remove();

  // localStorage에 저장하기
  storage_save();
};

let li_items = [];

// localStorage에 저장
const storage_save = () => {

  localStorage.setItem('li_items', JSON.stringify(li_items));
  // localStorage.setItem('li_items',li_items);

};

//handler
const handler = (event) => {

  //refresh 방지
  event.preventDefault();

  // 빈문자열이 아닌 경우에만 추가
  //ul에 li 추가
  if (input.value !== '') {
    const li_item = {
      id: Date.now(),
      content: input.value,
    };

    li_items.push(li_item);
    console.log(li_items);

    addLi(li_item);

    storage_save();
  };

  // li 초기화
  input.value = '';

};

//listener
form.addEventListener('submit', handler);

//페이지가 로드 될때, localStorage에 저장된 데이터 가져오기
const init = () => {
  const localStorage_data = JSON.parse(localStorage.getItem('li_items'));
  
  // 전역변수 저장
  
  if(localStorage_data){
    localStorage_data.forEach(value => addLi(value));
    li_items = localStorage_data;
  }
  
};

init();

//모달
btn.addEventListener('click', () => {
  modal.classList.add('active');
  overlay.classList.add('active');
});

// btn_close.addEventListener('click', () => {
//   modal.classList.remove('active');
//   overlay.classList.remove('active');
// });

// overlay.addEventListener('click', () => {
//   modal.classList.remove('active');
//   overlay.classList.remove('active');
// });

element_arr = [btn_close, overlay];

element_arr.forEach((element) => {
  element.addEventListener('click', () => {
  modal.classList.remove('active');
  overlay.classList.remove('active');
  });
});







// 연습
// web browser의 localStorage

// localStorage.setItem(key, value);
// localStorage.getItem(key);

// localStorage.setItem('name','홍씨');
// const value = localStorage.getItem('name');
// console.log(value);

// //객체 저장

// const obj = {
//   name: '홍씨',
//   age: 26,
// };

// //객체를 JSON으로 변환
// // object type == > json
// // 직렬화
// // JSON.stringify(obj);

// localStorage.setItem('obj', obj);
// localStorage.setItem('obj', JSON.stringify(obj));

// // json 문자열 - > object type 변경
// // 역직렬화

// obj_value = JSON.parse(localStorage.getItem('obj')); 