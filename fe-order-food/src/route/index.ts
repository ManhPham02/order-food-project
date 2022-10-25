import { createWebHistory,createRouter,RouteRecordRaw } from "vue-router";
import HelloWorld from "../components/HelloWorld.vue";
import Home from "../components/home.vue";
const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        name: 'HelloWorld',
        component: HelloWorld,
        meta : {
            layout: HelloWorld
        }
    },
    {
        path: '/test',
        name: 'home',
        component: Home,
        meta : {
            layout: Home
        }
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router