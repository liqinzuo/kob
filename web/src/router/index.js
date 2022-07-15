import { createRouter, createWebHistory } from 'vue-router'
import  PKIndexView from '../views/pk/PKIndexView'
import  RecordIndexView from '../views/record/RecordIndexView'
import  RanklistIndexView from '../views/ranklist/RanklistIndexView'
import  UserBotIndexView  from '../views/user/bots/UserBotIndexView'
import  NotFound from '../views/error/NotFound'

const routes = [
  {
    path: "/",
    name:  "home",
    redirect: "/pk/"
  },
  {
    path: "/pk/",
    name: "pk_index",
    component : PKIndexView,
  },
  {
    path: "/record/",
    name: "record_index",
    component : RecordIndexView,
  },
  {
    path: "/ranklist/",
    name: "ranklist_index",
    component : RanklistIndexView,
  },
  {
    path: "/user/bots/",
    name: "user_bots_index",
    component : UserBotIndexView,
  },
  {
    path: "/404/",
    name: "404",
    component : NotFound,
  },
  {
    path: "/:catchAll(.*)",
    redirect: "/404"
  }


]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
