<script setup lang="ts">
  const {data: response, error} = await useFetch('http://localhost:8080/users');
  console.log(response.value);
</script>

<template>
  <v-card>
    <v-card-title>
      <h1>Users</h1>
    </v-card-title>
    <v-card-text>
      <p>Users page</p>
    </v-card-text>
    <table>{{response}}</table>
  </v-card>
</template>

<style scoped>

</style>