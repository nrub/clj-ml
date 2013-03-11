(defproject com.leadtune/clj-ml-dev "0.3.0"
  :description "Machine Learning library for Clojure built around Weka and friends"
;;  :repositories {"leadtune-repo" "http://utility.leadtune.com:8081/nexus/content/repositories/thirdparty/"}
  :javac-fork "true"
  :java-source-paths ["src/java"]
  :warn-on-reflection true
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [incanter/incanter-core "1.3.0"]
                 [incanter/incanter-charts "1.3.0"]
                 [nz.ac.waikato.cms.weka/weka-dev "3.7.8"]]
  :profiles {:dev
             {:dependencies [[midje "1.5-RC1"]
                             [swank-clojure "1.3.4"]]}})
