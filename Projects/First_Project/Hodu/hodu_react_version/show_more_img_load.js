const photo = document.querySelector('.second_article_img_space');
const btn = document.querySelector('.show_more_btn');
let pagetoPatch = 1;

btn.addEventListener('click', ()=>{fetchImages(pagetoPatch += 1);});

async function fetchImages(page) {
    try {
        const response = await fetch(`https://picsum.photos/v2/list?page=${page}&limit=3`);

        if (!response.ok) {
            throw new Error('네트워크 응답에 문제가 있습니다.');
        }

        const datas = await response.json();
        console.log(datas);
        makeImageList(datas);
    }

    catch(error) {
        console.error(error);
    }
}

function makeImageList(datas) {
    const div = document.createElement('div');
    datas.forEach((data) => {
        const img = document.createElement('img');
        img.src = data.download_url;
        img.classList.add('img_resize');
        div.appendChild(img);
    });
    photo.appendChild(div);
}