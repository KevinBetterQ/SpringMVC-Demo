package com.kwq.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.kwq.form.ProductForm;


/**
 * 功能概要：UserController
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */
@Controller
public class UserController {

	
	@RequestMapping("/")
	public ModelAndView getfirst(){
		System.out.println("ssss");
		ModelAndView mav = new ModelAndView("action");
		return mav;  
	}


	@RequestMapping("/product_input")
	public ModelAndView inputProduct(){    
		ModelAndView mav = new ModelAndView("ProductForm"); 
        return mav;  
    }  
	
	@RequestMapping(value="/product_save")
    public ModelAndView saveProduct(ProductForm product) {
        /*Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(
                    productForm.getPrice()));
        } catch (NumberFormatException e) {
        }
*/
        ModelAndView mav = new ModelAndView("ProductDetails"); 
	    mav.addObject("product", product); 
        return mav;
    }
	
	
}
