const element = document.getElementById('greeting');

function textChange() {
  //방법 1
  element.innerText = 'Do it';
  element.style.backgroundColor = 'lightgreen';
}

function textBefore(){
  element.innerText= 'hello to you';
  element.style.backgroundColor = 'initial';
}