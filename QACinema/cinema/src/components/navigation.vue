<template>
    <div id="nav" >
      <nav class="navbar navbar-inverse">
        <div class="container-fluid">
          <div class="navbar-header">
            <li><router-link to="/"><a class="navbar-brand" href="#">QA Cinema</a></router-link></li>
          </div>
          <ul class="nav navbar-nav" style="font-size: large" >
            <li class="active navbar-center"><router-link to="/"><a href="#">Home</a></router-link></li>
            <li ><router-link to="/listing"><a href="#">Listings Gallery</a></router-link></li>
            <li><router-link to="/opening"><a href="#">Opening Times </a></router-link></li>
            <li><router-link to="/newlisting"><a href="#">New Release Listings </a></router-link></li>
            <li><router-link to="/classification"><a href="#">Classification </a></router-link></li>
            <li><router-link to="/booking"><a href="#">Ticket Booking </a></router-link></li>
            </ul>
          <form class="navbar-form navbar-right" action="/action_page.php">
            <li><router-link to="/login"><a href="#">Login/Sign up?</a></router-link></li>
            <div class="input-group">
             <input type="text" class="form-control" placeholder="Search" name="search" align="right">
              <div class="input-group-btn">
                <button class="btn btn-default" type="submit">
                  <i class="glyphicon glyphicon-search"></i>
                </button>
              </div>
            </div>
          </form>
        </div>
      </nav>
    </div>
</template>

<script>
export default {
  name: 'navigation'
}
</script>

<style scoped>
  ul {
    list-style-type: none;
    margin: 0;
    padding: 0%;
    overflow: hidden;
  }
  li {
    float: left;
  }
  li a {
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
  }
  li a:hover {
    background-color: #111;
  }
</style>
