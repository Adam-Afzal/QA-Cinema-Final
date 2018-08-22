<template>
  <div class="hello">
    <head>
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <navigation/>
    <body>
    <h1>New Releases Gallery</h1>
    <div id="myCarousel" class="carousel slide" data-ride="carousel" align="center">
    <p>Forthcoming Movies Gallery</p>
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
      </ol>

      <!-- Wrapper for slides -->
      <div class="carousel-inner">
        <div class="item active">
          <img src="../assets/antman.png" alt="Antman and the Wasp" width="600" height="600" align="center">
        </div>

        <div class="item">
          <img src="../assets/deadpool.jpg" alt="Deadpool 2" width="600" height="600" align="center">
        </div>

        <div class="item">
          <img src="../assets/incredibles.jpg" alt="Incredibles 2" width="600" height="600" align="center">
        </div>
        <div class="item">
          <img src="../assets/logan.png" alt="Logan" width="600" height="600" align="center">
        </div>

      <!-- Left and right controls -->
      <a class="left carousel-control" href="#myCarousel" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
    </div>
    </body>
    <Footer/>
  </div>
</template>
<script>
import Navigation from './navigation'
import Footer from './footer'
/* eslint-disable */
export default {
  name: 'ListingsGallery',
  components: {Navigation, Footer},
  data () {
    return {
    }
  }
}
</script>

<style scoped>

</style>
