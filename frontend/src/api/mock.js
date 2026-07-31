/* Copyright 2026 上海如静知华信息科技有限公司 */
export const accounts=[
  {code:'ACC-CMB-001',name:'招商银行基本户',bank:'招商银行上海张江支行',type:'基本户',balance:286.45,available:278.83,status:'正常'},
  {code:'ACC-ICBC-002',name:'工商银行一般户',bank:'工商银行上海浦东支行',type:'一般户',balance:128.62,available:128.62,status:'正常'},
  {code:'ACC-ALIPAY-003',name:'支付宝企业账户',bank:'支付宝',type:'第三方支付',balance:18.64,available:17.56,status:'正常'},
  {code:'ACC-CMB-004',name:'招商银行保证金户',bank:'招商银行上海张江支行',type:'保证金户',balance:76.20,available:0,status:'受限'}
]
export const receivables=[
  {no:'AR-2607-018',customer:'澄川智能制造有限公司',source:'HT-2026-031 · 项目进度款',amount:86,received:50,due:'08-03',owner:'顾清禾',status:'部分收款'},
  {no:'AR-2607-023',customer:'启衡实业集团有限公司',source:'HT-2026-044 · 软件实施款',amount:126,received:0,due:'08-08',owner:'许知遥',status:'待收款'},
  {no:'AR-2606-097',customer:'锐恒装备股份有限公司',source:'HT-2026-019 · 运维服务费',amount:23.8,received:0,due:'07-26',owner:'林清越',status:'已逾期'},
  {no:'AR-2607-036',customer:'云岱精工有限公司',source:'HT-2026-052 · 咨询首付款',amount:32,received:16,due:'08-15',owner:'唐予安',status:'部分收款'},
  {no:'AR-2607-041',customer:'北辰商业管理有限公司',source:'HT-2026-061 · 订阅服务费',amount:18.6,received:0,due:'08-22',owner:'苏景行',status:'待收款'}
]
export const payables=[
  {no:'AP-2607-112',supplier:'上海云舟科技有限公司',source:'CG-2026-088 · 云资源采购',amount:18.65,paid:0,due:'08-02',applicant:'江叙',status:'待付款'},
  {no:'AP-2607-108',supplier:'杭州启明咨询有限公司',source:'FW-2026-024 · 专家服务',amount:9.8,paid:4.9,due:'08-06',applicant:'苏景行',status:'部分付款'},
  {no:'AP-2607-119',supplier:'上海简印办公用品有限公司',source:'CG-2026-096 · 办公采购',amount:2.864,paid:0,due:'08-12',applicant:'温书屿',status:'审批中'},
  {no:'AP-2607-126',supplier:'上海卓衡律师事务所',source:'FW-2026-031 · 法律顾问费',amount:6.5,paid:0,due:'08-18',applicant:'陆嘉言',status:'待付款'}
]
export const expenses=[
  {no:'BX-260731-034',person:'温书屿',dept:'咨询交付部',category:'差旅费',purpose:'南京客户现场蓝图调研',amount:'2,860.50',date:'07-30',status:'待审批'},
  {no:'BX-260731-029',person:'江叙',dept:'研发中心',category:'业务招待费',purpose:'仓储项目接口联合评审',amount:'1,280.00',date:'07-29',status:'待付款'},
  {no:'BX-260730-086',person:'顾呈',dept:'产品中心',category:'交通费',purpose:'客户现场原型访谈往返',amount:'368.00',date:'07-28',status:'已完成'},
  {no:'BX-260729-061',person:'唐予安',dept:'数据服务部',category:'差旅费',purpose:'主数据治理项目驻场',amount:'4,620.00',date:'07-27',status:'已驳回'}
]
export const budgets=[
  {dept:'研发中心',subject:'研发投入',annual:320,occupied:36,actual:184,rate:57.5,status:'正常'},
  {dept:'咨询交付部',subject:'项目交付',annual:268,occupied:28,actual:152,rate:56.7,status:'正常'},
  {dept:'市场中心',subject:'市场推广',annual:120,occupied:16.8,actual:88.6,rate:73.8,status:'预警'},
  {dept:'综合管理部',subject:'行政运营',annual:96,occupied:9.2,actual:54.8,rate:57.1,status:'正常'},
  {dept:'产品中心',subject:'产品运营',annual:148,occupied:12.5,actual:72.4,rate:48.9,status:'正常'}
]
export const cashflow=[92,118,105,136,124,158,145,172,151,188,176,204]
