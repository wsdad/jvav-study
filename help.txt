echo "#hello-world" >> README.md 
git init 初始化
git add README.md 添加文件到缓存区
git commit -m "first commit" 提交到本地仓库
git branch -M main 生成主分支
git remote add origin https://github.com/wsdad/hello-world.git 连接github
 git push -u origin main 提交到线上仓库

 echo "学习git" >> README.md
   21  git add .
   23  git commit -m "git测试"
   24  git status
   26  git add help.txt
   27  git commit -m "修改help.txt"
   30  git log --pretty=oneline
   31  git reset --hard 1fef18f53c259a49380eafc19a37334878bd1f44
   32  git log --pretty=oneline
   34  git reflog
   35  git reset --hard 36ae1da
