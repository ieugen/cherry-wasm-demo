(ns my.cherry
  (:require [cherry.embed :as cherry]))

(cherry/preserve-ns 'cljs.core)
(cherry/preserve-ns 'clojure.string)

(defn add [a b]
  (+ a b))

(defn init []
  (println "Hello from init!" (add 1 3)))

(println "Hello world!" (add 1 4))
