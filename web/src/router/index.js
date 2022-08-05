import { createRouter, createWebHistory } from 'vue-router'
import  PKIndexView from '../views/pk/PKIndexView'
import  RecordIndexView from '../views/record/RecordIndexView'
import  RanklistIndexView from '../views/ranklist/RanklistIndexView'
import  UserBotIndexView  from '../views/user/bots/UserBotIndexView'
import  NotFound from '../views/error/NotFound'
import  UserAccountLoginView from '../views/user/account/UserAccountLoginView'
import  UserAccountRegisterView from '../views/user/account/UserAccountRegisterView'
import  store from '../store/index'

const routes = [
  {
    path: "/",
    name:  "home",
    redirect: "/pk/",
    meta:{
      reuqestAuth: true,
    }
  },
  {
    path: "/pk/",
    name: "pk_index",
    component : PKIndexView,
    meta:{
      reuqestAuth: true,
    }
  },
  {
    path: "/record/",
    name: "record_index",
    component : RecordIndexView,
    meta:{
      reuqestAuth: true,
    }
  },
  {
    path: "/ranklist/",
    name: "ranklist_index",
    component : RanklistIndexView,
    meta:{
      reuqestAuth: true,
    }
  },
  {
    path: "/user/bots/",
    name: "user_bots_index",
    component : UserBotIndexView,
    meta:{
      reuqestAuth: true,
    }
  },
  {
    path: "/user/account/login/",
    name: "user_account_login",
    component : UserAccountLoginView,
    meta:{
      reuqestAuth: false,
    }
  },
  {
    path: "/user/account/register/",
    name: "user_account_register",
    component : UserAccountRegisterView,
    meta:{
      reuqestAuth: false,
    }
  },
  {
    path: "/404/",
    name: "404",
    component : NotFound,
    meta:{
      reuqestAuth: false,
    }
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

router.beforeEach((to, from, next)=>{
  if(to.meta.reuqestAuth && !store.state.user.is_login){
    next({name:"user_account_login"});
  }else{
    next();
  }
})

export default router
