<template>
  <div class="hello">
    <head>
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <navigation/>

  </div>

</template>

import Navigation from './navigation'
<script>
  /* eslint-disable */
  export default {
    name: 'Screens',
    slideIndex: 1
  showSlides(slideIndex)

  function plusSlides (n) {
    showSlides(slideIndex += n);
  }

  function currentSlide (n) {
    showSlides(slideIndex = n);
  }

  function showSlides (n) {
    let i
    var slides = document.getElementsByClassName("mySlides");
    let dots = document.getElementsByClassName("dot");
    if (n > slides.length) {slideIndex = 1}
    if (n < 1) {slideIndex = slides.length}
    for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
    }
    for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex - 1].style.display = "block";
    dots[slideIndex - 1].className += " active";
  }
</script>

<style scoped>

</style>
