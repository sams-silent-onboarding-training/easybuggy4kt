package org.t246osslab.easybuggy4kt.vulnerabilities

import java.io.IOException
import java.util.Locale

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import org.t246osslab.easybuggy4kt.controller.DefaultLoginController

@Controller
class SessionFixationController : DefaultLoginController() {

    @RequestMapping(value = "/sessionfixation/login", method = arrayOf(RequestMethod.GET))
    fun doGet(mav: ModelAndView, req: HttpServletRequest, res: HttpServletResponse, locale: Locale): ModelAndView {
        req.setAttribute("note", msg?.getMessage("msg.note.session.fixation", null, locale))
        super.doGet(mav, req, res, locale)
        return mav
    }

    @RequestMapping(value = "/sessionfixation/login", method = arrayOf(RequestMethod.POST))
    @Throws(IOException::class)
    fun doPost(mav: ModelAndView, req: HttpServletRequest, res: HttpServletResponse, locale: Locale): ModelAndView {
        return super.doPost(mav, req, res, locale)
    }
}
