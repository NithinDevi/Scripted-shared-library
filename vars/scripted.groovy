def gitdownload(repo)
{
     git "https://github.com/intelliqittrainings/${repo}.git"
}
def mavenbuild()
{
    sh 'mvn package'
}
def  deploytomcat(jobname,ipadress,contextpath)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipadress}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
