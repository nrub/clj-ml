(defproject com.leadtune/clj-ml "0.2.4"
  :description "Machine Learning library for Clojure built around Weka and friends"
  :repositories {"leadtune-repo" "http://utility.leadtune.com:8081/nexus/content/repositories/thirdparty/"}
  :javac-fork "true"
  :java-source-paths ["src/java"]
  :warn-on-reflection true
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [incanter/incanter-core "1.3.0"]
                 [incanter/incanter-charts "1.3.0"]
                 [cs.waikato.ac.nz/weka "3.6.3"]
                 [hr.irb/fastRandomForest "0.98"]]
  :profiles {:dev
             {:dependencies [[midje "1.5-RC1"]
                             [swank-clojure "1.3.4"]]}})
