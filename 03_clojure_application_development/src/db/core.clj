(ns db.core
  (:require [environ.core :refer [env]]))

;; login to postgresql on linux
;; sudo -u postgres psql
;; \l = list all databases
;; \dt = all tables in db
(def connection
  "Map representing the database connection."
  {:dbtype (:database-type env)
   :dbname (:database-name env)
   :user (:database-username env)
   :password (:database-password env)
   :host (:database-host env)
   :port (:database-port env)})

(def test-con
  {:dbtype "postgresql"
   :dbname "url_shortening_db_dev"
   :user "postgres"
   :password "p_ostgre-S"
   :host "localhost"
   :port "5432"})
