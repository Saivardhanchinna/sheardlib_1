def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Saivardhanchinna/${repo}.git"
  
}
def build()
{
  sh "mvn clean package"
}
