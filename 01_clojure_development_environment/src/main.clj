(ns main)

(def my-name "BEL")

(defn hello-message
  [name]
  (str "Hello " name))

(defn -main
  [& args]
  (println (hello-message my-name)))

(def a 3)

(println (str "a=" a))
