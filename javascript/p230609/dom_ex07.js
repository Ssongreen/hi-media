// 이벤트 리스너
// 이벤트가 발생했을 때 그 처리를 담당하는 함수,
// 이벤트를 감지하여, 실행하는 함수를 이벤트 핸들러
//문법 
//엘리먼트.addEventListener('이벤트', '' )
const emoji = document.querySelector('.emoji');
const h1 = document.querySelector('h1');
const text_Change = document.querySelector('.text_Change');
const remove = document.querySelector('.remove');

emoji.addEventListener('click', emojiHandler);
remove.addEventListener('click', removeHandler);
function emojiHandler(event) {
  console.log(event);
  console.log('😎');
}

text_Change.addEventListener('click', function () {
  h1.innerText = ('텍스트 변경');
  h1.style.backgroundColor = 'lightgreen';
});

h1.addEventListener('mouseover', () => console.log('👌지나감'));

function removeHandler(){
  console.log('이모지 해제')
  emoji.removeEventListener('click', emojiHandler);
}