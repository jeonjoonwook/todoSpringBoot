<template>
  <div id="app">
  testAxios
  </div>

</template>
<script>
import axios from 'axios'

export default{
  created(){
    axios.get('http://localhost:5000/test')
    .then(response=>{
      console.log(response);
    })
  }
}

</script>
