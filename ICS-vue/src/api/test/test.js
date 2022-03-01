import request from '@/utils/request'

// 查询ICS测试类列表
export function listTest(query) {
  return request({
    url: '/test/test/list',
    method: 'get',
    params: query
  })
}

// 查询ICS测试类详细
export function getTest(id) {
  return request({
    url: '/test/test/' + id,
    method: 'get'
  })
}

// 新增ICS测试类
export function addTest(data) {
  return request({
    url: '/test/test',
    method: 'post',
    data: data
  })
}

// 修改ICS测试类
export function updateTest(data) {
  return request({
    url: '/test/test',
    method: 'put',
    data: data
  })
}

// 删除ICS测试类
export function delTest(id) {
  return request({
    url: '/test/test/' + id,
    method: 'delete'
  })
}
