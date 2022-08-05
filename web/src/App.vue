<template>
  <NavBar />
  <router-view/>
</template>


<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
//import $ from 'jquery'

export default{
  components:{
    NavBar
  },
  setup(){
    /*
    $.ajax({
      url: "http://localhost:3600/user/account/token/",
      type: "post",
      data:{
        username:'b',
        password:'pb',
      },
      success(resp){
        console.log(resp);
      },
      error(resp){
        console.log(resp);
      }
    })
    $.ajax({
      url:"http://localhost:3600/user/account/info/",
      type:"get",
      headers:{
        Authorization:"Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI0YTM2ZmQwNmEwMTc0Njg4YTE5ZTI2OWMxNGY3MGFkOSIsInN1YiI6IjIiLCJpc3MiOiJzZyIsImlhdCI6MTY1OTIwNDc2MiwiZXhwIjoxNjYwNDE0MzYyfQ.OjJllXoxWqdKBQDuLQBJMHhkiNdMbmYdrar9wgYcHWM"
      },
      success(resp){
        console.log(resp);
      },
      error(resp){
        console.log(resp);
      }
    })
    $.ajax({
      url:"http://localhost:3600/user/account/register/",
      type:"post",
      data:{
        username: "yxc2",
        password: "123",
        confirmedPassword:"123",
      },
       success(resp){
        console.log(resp);
      },
      error(resp){
        console.log(resp);
      }
    })
    */
  }
  
}
</script>

<style>
body{
  background-image: url("~@/assets/images/background.png");
  background-size: cover;
}
</style>
