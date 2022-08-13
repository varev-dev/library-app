<template>
  <div class="hello">
    <h1>{{message}}</h1>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      message: ''
    }
  },
  mounted() {
    fetch("/api/messages/test")
      .then((response) => response.text())
      .then((data) => {
        this.message = data;
      })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
