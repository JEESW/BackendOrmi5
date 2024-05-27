window.onscroll = function() {
    scrollFunction();
};

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("scroll_up_btn").style.display = "block";
    } else {
        document.getElementById("scroll_up_btn").style.display = "none";
    }
}

function topFunction() {
    document.body.scrollTop = 0; // Safari 용
    document.documentElement.scrollTop = 0; // Chrome, Firefox, IE and Opera 용
}

document.getElementById("scroll_up_btn").addEventListener("click", topFunction);