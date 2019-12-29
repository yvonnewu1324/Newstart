# Newstart
媽的剛才怎麼這麼難用媽的為啥部會給我排版
錢號部用打
first 先切換到要控制的目錄(桌面/資料夾名稱)
$ cd Desktop/git_test
初始化
$ git init
查看一下狀態
$ git status
顯示：
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .classpath
        .project
        .settings/
        bin/
        src/
開始把他們加到暫存區
$ git add .classpath
然後再commit放到倉庫裡並說明做了什麼動作("init commit")
$ git commit -m "init commit"
會顯示:
[master (root-commit) d638bcd] init commit
 9 files changed, 153 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 create mode 100644 bin/Keyword.class
 create mode 100644 bin/KeywordList.class
 create mode 100644 bin/Main.class
 create mode 100644 src/Keyword.java
 create mode 100644 src/KeywordList.java
 create mode 100644 src/Main.java
現在在他媽的傳到GitHub上設置節點
$ git remote add origin https://github.com/YvonneWu1999/Newstart.git
push檔案
$ git push -u origin master
成功的話就顯示：
Enumerating objects: 14, done.
Counting objects: 100% (14/14), done.
Delta compression using up to 8 threads
Compressing objects: 100% (14/14), done.
Writing objects: 100% (14/14), 4.78 KiB | 1.59 MiB/s, done.
Total 14 (delta 0), reused 0 (delta 0)
To https://github.com/YvonneWu1999/Newstart.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

