<template>
  <div class="hello">
    <head>
      <title>QA Cinema</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <navigation/>
    <body>
 <h1>Opening times</h1>
<p>Opening times for the cinemas are shown below.</p>
    <h3>Standard hours</h3>
    <TABLE width="50%" border="0" align=center>
      <TR style="font-weight:bold">
        <TD> Day</TD>
        <TD> Times </TD>
      </TR>
      <TR>
        <TD>Monday-Thursday</TD>
        <TD>9 am - 10pm </TD>
      </TR>
      <TR>
        <TD>Friday-Saturday</TD>
        <TD>9 am - 11pm </TD>
      </TR>
      <TR>
        <TD>Sunday</TD>
        <TD>10 am - 10pm </TD>
      </TR>
    </TABLE><br>
    <h3>Special days</h3>
     <p>QA cinemas are still open in certain holdiay periods, with special hours.</p>
      <TABLE width="50%" border="0" align="center">
        <TR style="font-weight:bold">
          <TD> Day</TD>
          <TD> Times </TD>
        </TR>
        <TR>
          <TD>Bank holidays</TD>
          <TD>10 am - 10pm </TD>
        </TR>
        <TR>
          <TD>Easter Friday/sunday</TD>
          <TD>10 am - 10pm </TD>
        </TR>
        <TR>
          <TD>Christmas eve</TD>
          <TD>10 am - 10pm </TD>
        </TR>
        <TR>
          <TD>New years eve</TD>
          <TD>10 am - 10pm </TD>
        </TR>
      </TABLE><br>
    <p>Subject to updates, all times apply throughout the year.</p>
    </body>
    <Footer/>
  </div>
</template>

<script>
import Navigation from './navigation'
import Footer from './footer'
export default {
  name: 'HelloWorld',
  components: {Navigation, Footer},
  data () {
    return {
    }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 50%;
  }
  td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
  }

  tr:nth-child(even) {
    background-color: #dddddd;
  }
</style>
