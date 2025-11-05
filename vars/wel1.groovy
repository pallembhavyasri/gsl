
def call(String pipelineName) {

    String fullClassName = "com.example.${className}"
    def pipelineClass = this.class.classLoader.loadClass(fullClassName)
    def instance = pipelineClass.newInstance(this)
    instance.run()
}
