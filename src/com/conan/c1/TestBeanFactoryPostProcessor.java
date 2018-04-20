package com.conan.c1;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author huangjinsheng on 2017/11/11.
 */
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    /**
     * Modify the application context's internal bean factory after its standard
     * initialization. All bean definitions will have been loaded, but no beans
     * will have been instantiated yet. This allows for overriding or adding
     * properties even to eager-initializing beans.
     *
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException in case of errors
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("TestBeanFactoryPostProcessor===========================");
        /**
         * 不要用户getBean,会造成对象提前创建
         */
        /*UserService userService = beanFactory.getBean("userService",UserService.class);
        userService.setUserId("tttttt2");*/

        BeanDefinition bd = beanFactory.getBeanDefinition("userService");
        MutablePropertyValues mutablePropertyValues = bd.getPropertyValues();
        mutablePropertyValues.addPropertyValue("userId","sdfdsfdsfsfsdfdsfsdfds");
    }
}
