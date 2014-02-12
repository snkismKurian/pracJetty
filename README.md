pracJetty
=========
Jenkins:8080ポート
Jetty:9002ポート
Java:SE1.7

---------
実行ﾃｽﾄ用
debug:localhost:9002/sampleJetty/servlet

---------
gitフロー
#devel  -> 開発用 -> masterにマージ
#master -> マージされるのみ
#hotfix -> 緊急用 -> devel, masterにマージ -> マージしたら破棄する
