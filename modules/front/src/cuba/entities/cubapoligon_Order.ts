import { StandardEntity } from "./base/sys$StandardEntity";
import { Customer } from "./cubapoligon_Customer";
import { OrderLine } from "./cubapoligon_OrderLine";
export class Order extends StandardEntity {
  static NAME = "cubapoligon_Order";
  customer?: Customer | null;
  orderLine?: OrderLine[] | null;
  date?: any | null;
  amount?: any | null;
  number?: string | null;
}
export type OrderViewName = "_base" | "_local" | "_minimal" | "order-view";
export type OrderView<V extends OrderViewName> = V extends "_base"
  ? Pick<Order, "id" | "number" | "date" | "amount">
  : V extends "_local"
  ? Pick<Order, "id" | "date" | "amount" | "number">
  : V extends "_minimal"
  ? Pick<Order, "id" | "number" | "date">
  : V extends "order-view"
  ? Pick<Order, "id" | "date" | "amount" | "number" | "customer">
  : never;
