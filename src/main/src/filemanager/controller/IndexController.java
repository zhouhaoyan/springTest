package filemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhouhaoyan on 2017/2/6.
 * Project name: springTest
 * Package name: PACKAGE_NAME.
 * Description:
 */
@Controller
@RequestMapping("index/")
public class IndexController {
    @RequestMapping("page")
    public ModelAndView index(){
            ModelAndView view=new ModelAndView();
            view.setViewName("views/index");
            return  view;
    }


}
