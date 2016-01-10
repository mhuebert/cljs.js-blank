(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'blank.core
                       :output-dir "out"
                       :output-to "out/main.js"})