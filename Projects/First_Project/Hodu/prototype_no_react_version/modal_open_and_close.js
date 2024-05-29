const modal = document.querySelector('.modal');
const thanksPageBtn = document.getElementById('thanksPageBtn');
const thanksCloseBtn = document.getElementById('thanksCloseBtn');

thanksPageBtn.addEventListener('click', function () {
    modal.classList.remove('no_show_modal');
    modal.classList.add('show_modal');
});

thanksCloseBtn.addEventListener('click', function () {
    modal.classList.remove('show_modal');
    modal.classList.add('no_show_modal');
});