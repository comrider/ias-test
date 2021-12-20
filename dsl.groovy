job ('new dsl job'){
    discription ('this is a complete ASL project ${ENV.BUILD_ID}')
    scm{
        git ('https://github.com/comrider/ias-test.git', 'master')
    }
    trigger{
        scm ( '* * * * *' )
    }
    steps{
        mvn('clean package','maven-samples/single-module/pom.xml')
    }
    publish{
        archiveArtifacts artifacts '**/*.war'
    }
}
