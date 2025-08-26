def gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/Saivardhanchinna/${repo}.git"
  
}
def build()
{
  sh "mvn clean package"
}
def deployment(jobname,ip)
{
 sh """
scp /var/lib/jenkins/workspace/${jobname}/Helloworld.java ubuntu@${ip}:/home/ubuntu/demo1
"""
}
