package bean;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

	@RequestMapping("/")  
    public String display()  
    {  
        return "index";  
    } 
	@RequestMapping("/hello")
	public String show(Model m,@ModelAttribute("obj")model mod){
		
		
		m.addAttribute("key", mod.getName());
		return "viewpage";
		
	}
}
