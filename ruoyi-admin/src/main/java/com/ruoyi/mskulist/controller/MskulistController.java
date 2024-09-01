package com.ruoyi.mskulist.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.mskulist.domain.Mskulist;
import com.ruoyi.mskulist.service.IMskulistService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * mskulistController
 * 
 * @author ruoyi
 * @date 2024-09-01
 */
@RestController
@RequestMapping("/mskulist/mskulist")
public class MskulistController extends BaseController
{
    @Autowired
    private IMskulistService mskulistService;

    /**
     * 查询mskulist列表
     */
    @PreAuthorize("@ss.hasPermi('mskulist:mskulist:list')")
    @GetMapping("/list")
    public TableDataInfo list(Mskulist mskulist)
    {
        startPage();
        List<Mskulist> list = mskulistService.selectMskulistList(mskulist);
        return getDataTable(list);
    }

    /**
     * 导出mskulist列表
     */
    @PreAuthorize("@ss.hasPermi('mskulist:mskulist:export')")
    @Log(title = "mskulist", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Mskulist mskulist)
    {
        List<Mskulist> list = mskulistService.selectMskulistList(mskulist);
        ExcelUtil<Mskulist> util = new ExcelUtil<Mskulist>(Mskulist.class);
        util.exportExcel(response, list, "mskulist数据");
    }

    /**
     * 获取mskulist详细信息
     */
    @PreAuthorize("@ss.hasPermi('mskulist:mskulist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mskulistService.selectMskulistById(id));
    }

    /**
     * 新增mskulist
     */
    @PreAuthorize("@ss.hasPermi('mskulist:mskulist:add')")
    @Log(title = "mskulist", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Mskulist mskulist)
    {
        return toAjax(mskulistService.insertMskulist(mskulist));
    }

    /**
     * 修改mskulist
     */
    @PreAuthorize("@ss.hasPermi('mskulist:mskulist:edit')")
    @Log(title = "mskulist", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Mskulist mskulist)
    {
        return toAjax(mskulistService.updateMskulist(mskulist));
    }

    /**
     * 删除mskulist
     */
    @PreAuthorize("@ss.hasPermi('mskulist:mskulist:remove')")
    @Log(title = "mskulist", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mskulistService.deleteMskulistByIds(ids));
    }
}
