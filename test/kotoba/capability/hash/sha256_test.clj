(ns kotoba.capability.hash.sha256-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.hash.sha256 :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
