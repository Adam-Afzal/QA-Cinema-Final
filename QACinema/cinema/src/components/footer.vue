<template>
  <div id="footer" slot="page-bottom" >
    <div class="push"></div>
    <footer class="page-footer font-small blue">
      <div class="footer-copyright text-center py-3">© 2018 Copyright:
        <li ><router-link to="/aboutUs"><a href="#">About Us</a></router-link></li>
        <li><router-link to="/findUS"><a href="#">Find Us </a></router-link></li>
        <a href="https://mdbootstrap.com/bootstrap-tutorial/"> QACinema.com</a>
          </div>
    </footer>
  </div>
</template>

<script>
export default {
  name: 'footer'
}
</script>

<style scoped>
  footer {
    background-color: #2d2d30;
    color: #f5f5f5;
    padding: 32px}

  .push {
    height: 50px;
  }
  p{
    color:black;
    text-align: center;
  }
 </style>
