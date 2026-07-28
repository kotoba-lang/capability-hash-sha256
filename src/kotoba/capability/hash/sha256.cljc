(ns kotoba.capability.hash.sha256
  "Importable contract for hash/sha256."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "hash/sha256"))
