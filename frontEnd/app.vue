<template>
  <NuxtLayout>
    <v-app>
      <NuxtPage />
      <v-main>
        <v-container>
          <v-row>
            <v-col>
              <v-card>
                <v-card-title>
                  <h1>Frontend</h1>
                </v-card-title>
                <v-card-text>
                  <p>Frontend is running on port 3000</p>
                </v-card-text>
                <nuxt-link to="/users/">Users Page</nuxt-link>
              </v-card>
            </v-col>
          </v-row>
        </v-container>
        </v-main>
    </v-app>
  </NuxtLayout>
</template>
