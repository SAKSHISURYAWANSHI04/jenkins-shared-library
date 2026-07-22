stage('Build') {
    steps {
        echo "Building ${config.appName}"
        sh '''
            ls -la
            test -f index.html
            echo "Build Successful"
        '''
    }
}
